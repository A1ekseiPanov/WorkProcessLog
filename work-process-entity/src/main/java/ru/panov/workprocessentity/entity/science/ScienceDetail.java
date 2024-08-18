package ru.panov.workprocessentity.entity.science;

import jakarta.persistence.*;
import lombok.*;
import ru.panov.workprocessentity.entity.DetailInfo;

import java.util.List;
@Entity
@Table(name = "science_details")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ScienceDetail extends DetailInfo {
    @ElementCollection(targetClass = String.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "videos", joinColumns = @JoinColumn(name = "science_detail_id"))
    @Column(name = "video")
    private List<String> videos;
    @ElementCollection(targetClass = String.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "images", joinColumns = @JoinColumn(name = "science_detail_id"))
    @Column(name = "image")
    private List<String> images;
}