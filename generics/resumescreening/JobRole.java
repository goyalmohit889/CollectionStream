package com.bridgelabz.collectionstream.generics.resumescreening;

abstract class JobRole {
    private String roleName;

    public JobRole(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " - " + roleName;
    }
}