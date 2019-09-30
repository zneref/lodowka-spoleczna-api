package pl.wezpomoz.spolecznalodowka.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "lodowki")
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Lodowka {

    @Id
    private ObjectId _id;
    private double latitude;
    private double longitude;
    private String title;
    private String snippet;
    private boolean isOur;
    private String openHours;
    private String imageName;

    public String get_id() {
        return _id.toHexString();
    }
}
