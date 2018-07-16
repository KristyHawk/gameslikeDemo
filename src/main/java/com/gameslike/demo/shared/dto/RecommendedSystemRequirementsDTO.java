package com.gameslike.demo.shared.dto;

import javax.persistence.*;

@Table(name = "RECOMMENDED_REQ", schema = "DETAILS")
@Entity
public class RecommendedSystemRequirementsDTO {

    @Id
    @Column(name = "ID", nullable = false, length = 10)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "OS", nullable = false, length = 50)
    private String os;

    @Column(name = "PROCESSOR", nullable = false, length = 300)
    private String processor;

    @Column(name = "MEMORY", nullable = false, length = 300)
    private String memory;

    @Column(name = "GRAPHICS", nullable = false, length = 300)
    private String graphics;

    @Column(name = "NETWORK", nullable = false, length = 100)
    private String network;

    @Column(name = "STORAGE", nullable = false, length = 100)
    private String storage;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getGraphics() {
        return graphics;
    }

    public void setGraphics(String graphics) {
        this.graphics = graphics;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

}
