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
    private String id;
    private double latitude;
    private double longitude;
    private String title;
    private String snippet;
    private boolean our;
    private String hours;
    private boolean image;

}
