package com.siamminecraft.sklauncher;

import com.skcraft.launcher.auth.Session;
import com.skcraft.launcher.auth.UserType;

import java.util.Collections;
import java.util.Map;
import java.util.UUID;

/**
 * Created by Mizuki on 4/15/2014.
 */
public class CrackedSession implements Session{

    public CrackedSession(String name)
    {
        this.name = name;
    }

    private String name = null;

    @Override
    public String getUuid() {
        return (new UUID(0, 0)).toString();
    }

    public String getName() { return name; }

    @Override
    public String getClientToken() {
        return "0";
    }

    @Override
    public String getAccessToken() {
        return "0";
    }

    @Override
    public Map<String, String> getUserProperties() {
        return Collections.emptyMap();
    }

    @Override
    public String getSessionToken() {
        return "-";
    }

    @Override
    public UserType getUserType() {
        return UserType.LEGACY;
    }

    @Override
    public boolean isOnline() {
        return false;
    }
}
