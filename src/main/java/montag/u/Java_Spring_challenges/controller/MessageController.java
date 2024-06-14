package montag.u.Java_Spring_challenges.controller;

import montag.u.Java_Spring_challenges.models.Message;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/messages")
public class MessageController {
    private List<Message> messages = new ArrayList<>();

    @PostMapping
    public void addMessage(@RequestBody Message message) {
        messages.add(new Message(message.id(), message.name(), message.message()));
    }

    @GetMapping
    public List<Message> getMessages() {
        return messages;
    }

    @DeleteMapping("/{id}")
    public void deleteMessage(@PathVariable String id) {
        Message message = (messages.stream().filter(m -> m.id().equals(id)).findFirst().orElse(null));
        messages.remove(message);
    }
}
