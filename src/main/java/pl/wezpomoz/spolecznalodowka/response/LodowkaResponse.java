package pl.wezpomoz.spolecznalodowka.response;

import pl.wezpomoz.spolecznalodowka.model.LodowkaDTO;

import java.util.List;

public class LodowkaResponse {
    private List<LodowkaDTO> lodowki;

    public LodowkaResponse(List<LodowkaDTO> lodowki) {
        this.lodowki = lodowki;
    }

    public List<LodowkaDTO> getLodowki() {
        return lodowki;
    }

    public void setLodowki(List<LodowkaDTO> lodowki) {
        this.lodowki = lodowki;
    }
}
