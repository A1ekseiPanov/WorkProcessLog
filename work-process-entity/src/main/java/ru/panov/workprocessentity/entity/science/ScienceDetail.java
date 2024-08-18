package ru.panov.workprocessentity.entity.science;

import jakarta.persistence.*;
import lombok.*;
import ru.panov.workprocessentity.entity.Detail;

import java.util.List;
@Entity
@Table(name = "science_details", schema = "science")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@PrimaryKeyJoinColumn(name = "id")
public class ScienceDetail extends Detail {
    @ElementCollection(targetClass = String.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "videos", joinColumns = @JoinColumn(name = "science_detail_id"))
    @Column(name = "video")
    private List<String> videos;
    @ElementCollection(targetClass = String.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "images", joinColumns = @JoinColumn(name = "science_detail_id"))
    @Column(name = "image")
    private List<String> images;
}