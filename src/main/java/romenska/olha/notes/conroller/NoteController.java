package romenska.olha.notes.conroller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import romenska.olha.notes.domain.Note;
import romenska.olha.notes.repository.NoteRepository;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/notes")
public class NoteController {

    private final NoteRepository noteRepository;
    @GetMapping
    public List<Note> getNoteByPersonalId(@RequestParam Long personId){
        return  noteRepository.findAllByPersonId(personId);
    }

    @PostMapping
    public Note createNote(@RequestBody Note note){
        return noteRepository.save(note);
    }
}
