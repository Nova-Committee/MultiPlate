package committee.nova.test.init.services;

public enum PhysicalSide {

    CLIENT,

    SERVER;

    public boolean isClient() {

        return this == CLIENT;
    }

    public boolean isServer() {

        return this == SERVER;
    }
}
