package com.gameslike.demo.shared.dto;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Table(name = "game", schema = "DEV")
@Entity
public class GameDTO {

    @Id
    @Column(name = "ID", nullable = false, length = 10)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NAME", nullable = false, length = 100)
    private String name;

    @Column(name = "DESCRIPTION", nullable = false, length = 220)
    private String description;

    @Column(name = "DETAILED_DESCRIPTION", nullable = false, length = 10000)
    private String detailedDescription;

    @Column(name = "DEVELOPER", nullable = false, length = 100)
    private String developer;

    @Column(name = "PUBLISHER", nullable = false, length = 100)
    private String publisher;

    @Column(name = "PRICE", nullable = false)
    private float price;

    @Column(name = "POPULARITY_RATING")
    private Integer popularity_rating;

    @OneToMany(mappedBy = "game")
    private List<LanguageDTO> languagesList;

    @ManyToMany(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
    @JoinTable(
            name = "GAME_TAG", schema = "DEV",
            joinColumns = { @JoinColumn(name = "game_id", referencedColumnName="id") },
            inverseJoinColumns = { @JoinColumn(name = "tag_id", referencedColumnName="id") }
    )
    private List<TagDTO> tagsList = new ArrayList<>();

    @Column(name = "RELEASE_DATE")
    private Date releaseDate;

    @OneToMany(mappedBy = "game", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<CommentDTO> commentsList;

    @ManyToMany
    private List<UserDTO> users;

    @Column(name = "URL")
    private String url;

    @Column(name = "pictureBig")
    private String pictureBig;

    @Column(name = "screenshotOne")
    private String screenshotOne;

    @Column(name = "screenshotTwo")
    private String screenshotTwo;

    @OneToOne
    private MinimumSystemRequirementsDTO minSR;

    @OneToOne
    private RecommendedSystemRequirementsDTO recSR;

    @OneToOne
    private MinimumSystemRequirementsMacDTO minMacSR;

    @OneToOne
    private RecommendedSystemRequirementsMacDTO recMacSR;

    @OneToOne
    private MinimumSystemRequirementsLinuxDTO minLinSR;

    @OneToOne
    private RecommendedSystemRequirementsLinuxDTO recLinSR;


    public MinimumSystemRequirementsMacDTO getMinMacSR() {
        return minMacSR;
    }

    public void setMinMacSR(MinimumSystemRequirementsMacDTO minMacSR) {
        this.minMacSR = minMacSR;
    }

    public RecommendedSystemRequirementsMacDTO getRecMacSR() {
        return recMacSR;
    }

    public void setRecMacSR(RecommendedSystemRequirementsMacDTO recMacSR) {
        this.recMacSR = recMacSR;
    }

    public MinimumSystemRequirementsLinuxDTO getMinLinSR() {
        return minLinSR;
    }

    public void setMinLinSR(MinimumSystemRequirementsLinuxDTO minLinSR) {
        this.minLinSR = minLinSR;
    }

    public RecommendedSystemRequirementsLinuxDTO getRecLinSR() {
        return recLinSR;
    }

    public void setRecLinSR(RecommendedSystemRequirementsLinuxDTO recLinSR) {
        this.recLinSR = recLinSR;
    }

    public MinimumSystemRequirementsDTO getMinSR() {
        return minSR;
    }

    public void setMinSR(MinimumSystemRequirementsDTO minSR) {
        this.minSR = minSR;
    }

    public RecommendedSystemRequirementsDTO getRecSR() {
        return recSR;
    }

    public void setRecSR(RecommendedSystemRequirementsDTO recSR) {
        this.recSR = recSR;
    }

    public String getDetailedDescription() {
        return detailedDescription;
    }

    public void setDetailedDescription(String detailedDescription) {
        this.detailedDescription = detailedDescription;
    }

    public String getScreenshotOne() {
        return screenshotOne;
    }

    public void setScreenshotOne(String screenshotOne) {
        this.screenshotOne = screenshotOne;
    }

    public String getScreenshotTwo() {
        return screenshotTwo;
    }

    public void setScreenshotTwo(String screenshotTwo) {
        this.screenshotTwo = screenshotTwo;
    }

    public String getPictureBig() {
        return pictureBig;
    }

    public void setPictureBig(String pictureBig) {
        this.pictureBig = pictureBig;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Integer getPopularity_rating() {
        return popularity_rating;
    }

    public void setPopularity_rating(Integer popularity_rating) {
        this.popularity_rating = popularity_rating;
    }

    public List<LanguageDTO> getLanguagesList() {
        return languagesList;
    }

    public void setLanguagesList(List<LanguageDTO> languagesList) {
        this.languagesList = languagesList;
    }

    public List<TagDTO> getTagsList() {
        return tagsList;
    }

    public void setTagsList(List<TagDTO> tagsList) {
        this.tagsList = tagsList;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<CommentDTO> getCommentsList() {
        return commentsList;
    }

    public void setCommentsList(List<CommentDTO> commentsList) {
        this.commentsList = commentsList;
    }

    public List<UserDTO> getUsers() {
        return users;
    }

    public void setUsers(List<UserDTO> users) {
        this.users = users;
    }
}
