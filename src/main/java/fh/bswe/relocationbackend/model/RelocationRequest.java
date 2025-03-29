package fh.bswe.relocationbackend.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.OffsetDateTime;

@Entity(name = "request")
@Table(name = "request")
public class RelocationRequest implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Integer id;

    @Column(name = "clientname", nullable = true, length = 50)
    private String clientName;

    @Column(name = "fromcity", nullable = false, length = 30)
    private String fromCity;

    @Column(name = "fromzip", nullable = false)
    private Integer fromZip;

    @Column(name = "fromstreet", nullable = false, length = 50)
    private String fromStreet;

    @Column(name = "fromfloor", nullable = false)
    private Integer fromFloor;

    @Column(name = "fromelevator", nullable = false)
    private Boolean fromElevator = false;

    @Column(name = "tocity", nullable = false, length = 30)
    private String toCity;

    @Column(name = "tozip", nullable = false)
    private Integer toZip;

    @Column(name = "tostreet", nullable = false, length = 50)
    private String toStreet;

    @Column(name = "tofloor", nullable = false)
    private Integer toFloor;

    @Column(name = "toelevator", nullable = false)
    private Boolean toElevator = false;

    @Column(name = "relocationdate", nullable = false)
    private OffsetDateTime relocationDate;

    @Column(name = "packagingservice", nullable = false)
    private Boolean packagingService = false;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public OffsetDateTime getRelocationDate() {
        return relocationDate;
    }

    public void setRelocationDate(OffsetDateTime relocationDate) {
        this.relocationDate = relocationDate;
    }

    public Boolean getToElevator() {
        return toElevator;
    }

    public void setToElevator(Boolean toElevator) {
        this.toElevator = toElevator;
    }

    public Integer getToFloor() {
        return toFloor;
    }

    public void setToFloor(Integer toFloor) {
        this.toFloor = toFloor;
    }

    public String getToStreet() {
        return toStreet;
    }

    public void setToStreet(String toStreet) {
        this.toStreet = toStreet;
    }

    public Integer getToZip() {
        return toZip;
    }

    public void setToZip(Integer toZip) {
        this.toZip = toZip;
    }

    public String getToCity() {
        return toCity;
    }

    public void setToCity(String toCity) {
        this.toCity = toCity;
    }

    public Boolean getFromElevator() {
        return fromElevator;
    }

    public void setFromElevator(Boolean fromElevator) {
        this.fromElevator = fromElevator;
    }

    public Integer getFromFloor() {
        return fromFloor;
    }

    public void setFromFloor(Integer fromFloor) {
        this.fromFloor = fromFloor;
    }

    public String getFromStreet() {
        return fromStreet;
    }

    public void setFromStreet(String fromStreet) {
        this.fromStreet = fromStreet;
    }

    public Integer getFromZip() {
        return fromZip;
    }

    public void setFromZip(Integer fromZip) {
        this.fromZip = fromZip;
    }

    public String getFromCity() {
        return fromCity;
    }

    public void setFromCity(String fromCity) {
        this.fromCity = fromCity;
    }

    public Boolean getPackagingService() {
        return packagingService;
    }

    public void setPackagingService(Boolean packagingService) {
        this.packagingService = packagingService;
    }
}
