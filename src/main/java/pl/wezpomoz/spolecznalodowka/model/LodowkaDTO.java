package pl.wezpomoz.spolecznalodowka.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LodowkaDTO {

    private double latitude;
    private double longitude;
    private String title;
    private String snippet;
    private boolean isOur;
    private String openHours;
    private String imageName;

}
