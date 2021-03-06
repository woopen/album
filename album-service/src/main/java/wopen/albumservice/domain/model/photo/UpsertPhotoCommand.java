package wopen.albumservice.domain.model.photo;

import lombok.Data;
import wopen.albumservice.utils.$;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
public class UpsertPhotoCommand {
    @NotBlank
    private String photoId;
    private String albumId;
    private Boolean personal;
    private String title;
    private String originImageUrl;
    private String imageUrl;
    private String imageFilterType;
    private List<String> tags;

    public String getOriginImageUrl() {
        return $.extraFileName(originImageUrl);
    }

    public String getImageUrl() {
        return $.extraFileName(imageUrl);
    }
}
