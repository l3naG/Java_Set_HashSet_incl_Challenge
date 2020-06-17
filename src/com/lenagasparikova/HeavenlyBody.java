package com.lenagasparikova;

import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody {
    /* relates to previous solution/** /
    private final String name;
    private BodyTypes bodyType;
     */

    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    private final Key key;

    public enum BodyTypes {
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        ASTEROID
    }

    public HeavenlyBody(String name, BodyTypes bodyType, double orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
        this.key = new Key(name, bodyType);
    }

   /* relates to previous solution/** /
    public BodyTypes getBodyType() {
        return bodyType;
    }

    public String getName() {
        return name;
    }
    */

    public Key getKey() {
        return key;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addSatellites(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(satellites);
    }

    @Override
    public String toString() {
        return this.key.name + " : " + this.key.bodyType + ", " + this.orbitalPeriod;
    }

    public static Key makeKey(String name, BodyTypes bodyType) {
        return new Key(name, bodyType);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HeavenlyBody) {
            HeavenlyBody theObj = (HeavenlyBody) obj;
            /* relates to previous solution/** /
            if (this.name.equals(theObj.getName())) {
                return this.bodyType == theObj.getBodyType();
*/
            return this.key.equals(theObj.getKey());
        }
        return false;
    }

    @Override
    public final int hashCode() {
    /* relates to previous solution/** /
        return this.name.hashCode() + this.bodyType.hashCode() + 57;
     */
        return this.key.hashCode();
    }

// both equals() and hashCode() need to be overridden

    public static final class Key {
        private String name;
        private BodyTypes bodyType;

        private Key(String name, BodyTypes bodyType) {
            this.name = name;
            this.bodyType = bodyType;
        }

        public String getName() {
            return name;
        }

        public BodyTypes getBodyType() {
            return bodyType;
        }

        @Override
        public boolean equals(Object obj) {
            Key key = (Key) obj;
            if (this.name.equals(key.getName())) {
                return this.bodyType == key.getBodyType();
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode() + this.bodyType.hashCode() + 57;
        }

        @Override
        public String toString() {
            return this.name + " : " + this.bodyType;
        }
    }


}
