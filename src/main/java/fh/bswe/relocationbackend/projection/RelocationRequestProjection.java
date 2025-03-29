package fh.bswe.relocationbackend.projection;

import fh.bswe.relocationbackend.model.RelocationRequest;
import org.springframework.data.rest.core.config.Projection;

import java.time.OffsetDateTime;

@Projection(name = "relocationRequestProjection", types = { RelocationRequest.class })
public interface RelocationRequestProjection {
    Integer getId();
    String getClientName();
    String getFromCity();
    String getToCity();
    Integer getFromZip();
    Integer getToZip();
    String getFromStreet();
    String getToStreet();
    Integer getFromFloor();
    Integer getToFloor();
    Boolean getFromElevator();
    Boolean getToElevator();
    Boolean getPackagingService();
    OffsetDateTime getRelocationDate();
}
