package com.company;

public class CityId {
    private String name;

    public CityId(String pName) {
        name = pName;
    }

    public String toString()
    {
        return name;
    }

    public boolean equals(Object o)
    {
        boolean result = false;

        if (o instanceof CityId && this.name.equals(((CityId)o).name)) {
            result = true;
        }

        return result;
    }

    public int hashCode()
    {
        return this.name.hashCode();
    }
}
