package fh.bswe.relocationbackend;

import fh.bswe.relocationbackend.model.RelocationRequest;
import fh.bswe.relocationbackend.repository.RelocationRequestRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import java.time.OffsetDateTime;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@ActiveProfiles("test")
@DataJpaTest
public class RelocationRequestRepositoryTest {
    @Autowired
    private RelocationRequestRepository repository;

    private RelocationRequest createTestRequest() {
        RelocationRequest request = new RelocationRequest();
        request.setClientName("Daniel Düsentrieb");
        request.setFromCity("Entenhausen");
        request.setFromZip(3421);
        request.setFromStreet("Dagobert Street 1");
        request.setFromFloor(2);
        request.setFromElevator(true);
        request.setToCity("Siegendorf");
        request.setToZip(7011);
        request.setToStreet("Technologiestrasse 1");
        request.setToFloor(0);
        request.setToElevator(false);
        request.setRelocationDate(OffsetDateTime.now());
        request.setPackagingService(true);
        return request;
    }

    @Test
    @DisplayName("save() should persist a RelocationRequest")
    void testSave() {
        RelocationRequest saved = repository.save(createTestRequest());
        assertThat(saved.getId()).isNotNull();
    }

    @Test
    @DisplayName("findById() should return saved RelocationRequest")
    void testFindById() {
        RelocationRequest saved = repository.save(createTestRequest());
        Optional<RelocationRequest> found = repository.findById(saved.getId());
        assertThat(found).isPresent();
        assertThat(found.get().getClientName()).isEqualTo("Daniel Düsentrieb");
    }

    @Test
    @DisplayName("findAll() should return all requests")
    void testFindAll() {
        repository.save(createTestRequest());
        repository.save(createTestRequest());
        Iterable<RelocationRequest> all = repository.findAll();
        assertThat(all).hasSizeGreaterThanOrEqualTo(2);
    }

    @Test
    @DisplayName("deleteById() should remove the RelocationRequest")
    void testDeleteById() {
        RelocationRequest saved = repository.save(createTestRequest());
        repository.deleteById(saved.getId());
        assertThat(repository.findById(saved.getId())).isEmpty();
    }

    @Test
    @DisplayName("existsById() should return true for existing entity")
    void testExistsById() {
        RelocationRequest saved = repository.save(createTestRequest());
        boolean exists = repository.existsById(saved.getId());
        assertThat(exists).isTrue();
    }

    @Test
    @DisplayName("count() should return correct number of entries")
    void testCount() {
        long initial = repository.count();
        repository.save(createTestRequest());
        assertThat(repository.count()).isEqualTo(initial + 1);
    }
}
