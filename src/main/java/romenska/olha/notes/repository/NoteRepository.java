package romenska.olha.notes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import romenska.olha.notes.domain.Note;

import java.util.List;

public interface NoteRepository extends JpaRepository<Note,Long> {
    List<Note> findAllByPersonId(Long personId);
}
