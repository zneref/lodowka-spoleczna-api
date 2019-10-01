package pl.wezpomoz.spolecznalodowka.model;

import pl.wezpomoz.spolecznalodowka.model.LodowkaDTO;

import java.util.List;

public class LodowkaList {
    private List<LodowkaDTO> lodowki;

    public LodowkaList(List<LodowkaDTO> lodowki) {
        this.lodowki = lodowki;
    }

    public List<LodowkaDTO> getLodowki() {
        return lodowki;
    }

    public void setLodowki(List<LodowkaDTO> lodowki) {
        this.lodowki = lodowki;
    }
}
