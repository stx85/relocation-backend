package fh.bswe.relocationbackend.repository;

import fh.bswe.relocationbackend.model.RelocationRequest;
import fh.bswe.relocationbackend.projection.RelocationRequestProjection;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
@RepositoryRestResource(collectionResourceRel = "request", path = "request", excerptProjection = RelocationRequestProjection.class)
public interface RelocationRequestRepository extends CrudRepository<RelocationRequest, Integer> {
}
