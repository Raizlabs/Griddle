package com.raizlabs.android.dsl;

/**
 * Author: andrewgrosner
 * Contributors: { }
 * Description:
 */
public class RepositoryDsl {

    private String repoKey;

    private String username;

    private String password;

    private String contextUrl;

    private boolean maven = true;

    public RepositoryDsl(String repoKey, String username, String password, String contextUrl) {
        this.repoKey = repoKey;
        this.username = username;
        this.password = password;
        this.contextUrl = contextUrl;
    }

    public String getRepoKey() {
        return repoKey;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean maven(){
        return maven;
    }

    public void setMaven(boolean maven) {
        this.maven = maven;
    }

    public String getContextUrl() {
        return contextUrl;
    }

    public void setContextUrl(String contextUrl) {
        this.contextUrl = contextUrl;
    }
}
