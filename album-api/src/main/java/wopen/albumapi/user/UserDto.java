package wopen.albumapi.user;

import lombok.Data;
import wopen.albumservice.domain.model.user.Gender;
import wopen.albumservice.utils.$;

import java.time.Instant;

@Data
public class UserDto {
    private String username;
    private String email;
    private Gender gender;
    private String nickname;
    private String avatarUrl;
    private String bio;
    private String bannerUrl;
    private Instant joinedAt;
    private long photoCount;
    private long likeCount;
    private long viewedCount;
    private long likedCount;

    public String getEmail() {
        return $.maskEmail(email);
    }

    public String getAvatarUrl() {
        return $.addUrlPrefix(avatarUrl);
    }

    public String getBannerUrl() {
        return $.addUrlPrefix(bannerUrl);
    }
}
