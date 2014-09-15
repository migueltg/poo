package utils.v1;

import utils.Trunk;

public class TrunkImp implements Trunk {
    private String[] keys;

    private Object[] objects;

    public TrunkImp() {
        this.keys = new String[Trunk.MAX_SIZE];
        this.objects = new Object[Trunk.MAX_SIZE];
    }

    private int find(String key) {
        for (int i = 0; i < this.keys.length; i++) {
            if (this.keys[i] != null && this.keys[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    private int findVoid() {
        for (int i = 0; i < this.keys.length; i++) {
            if (this.keys[i] == null) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void put(String key, Object object) {
        int index = this.find(key);
        if (index == -1) {
            index = this.findVoid();
        }
        assert index != -1 : "baúl LLeno";
        this.keys[index] = key;
        this.objects[index] = object;
    }

    @Override
    public void remove(String key) {
        int index = this.find(key);
        if (index != -1) {
            this.keys[index] = null;
            this.objects[index] = null;
        }
    }

    @Override
    public Object get(String key) {
        int index = this.find(key);
        if (index != -1) {
            return this.objects[index];
        } else {
            return null;
        }
    }

    @Override
    public boolean isFull() {
        return this.findVoid() == -1;
    }

    @Override
    public boolean isEmpty() {
        for (String key : keys) {
            if (key != null)
                return false;
        }
        return true;
    }

}
