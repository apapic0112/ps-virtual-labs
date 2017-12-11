package si.elixir.vlabs.docker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProjectDetails {

    private List<String> clani = new ArrayList<String>(Arrays.asList("ap5327"));
    private String opis_projekta = "V projektu sem si zadal izgradnjo storitev, ki omogocajo dinamicno zaganjanje in nadzor virtualnih laboratorijev.";
    private List<String> mikrostoritve = new ArrayList<String>(Arrays.asList("http://35.198.126.179/v1/container"));
    private List<String> github = new ArrayList<String>(Arrays.asList("https://github.com/apapic0112/ps-virtual-labs"));
    private List<String> travis = new ArrayList<String>(Arrays.asList("https://travis-ci.org/apapic0112/ps-virtual-labs"));
    private List<String> dockerhub = new ArrayList<String>(Arrays.asList("https://hub.docker.com/u/ap5327/"));

    public List<String> getClani() {
        return clani;
    }

    public List<String> getGithub() {
        return github;
    }

    public List<String> getTravis() {
        return travis;
    }

    public List<String> getDockerhub() {
        return dockerhub;
    }

    public void setClani(List<String> clani) {

        this.clani = clani;
    }

    public void setGithub(List<String> github) {
        this.github = github;
    }

    public void setTravis(List<String> travis) {
        this.travis = travis;
    }

    public void setDockerhub(List<String> dockerhub) {
        this.dockerhub = dockerhub;
    }

    public String getOpis_projekta() {
        return opis_projekta;
    }

    public void setOpis_projekta(String opis_projekta) {
        this.opis_projekta = opis_projekta;
    }

    public List<String> getMikrostoritve() {
        return mikrostoritve;
    }

    public void setMikrostoritve(List<String> mikrostoritve) {
        this.mikrostoritve = mikrostoritve;
    }
}
