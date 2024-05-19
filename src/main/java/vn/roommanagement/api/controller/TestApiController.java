package vn.roommanagement.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import vn.roommanagement.api.entity.Room;
import vn.roommanagement.api.repository.impl.RoomRepositoryImpl;

import java.util.Collection;

@RestController
@RequestMapping("api/test/v1/test")
public class TestApiController {

    @Autowired
    private RoomRepositoryImpl repository;

    @GetMapping("/{id}")
    public Room findById(@PathVariable long id) throws Exception {
        return (Room) repository.findById(id)
                .orElseThrow(() -> new Exception());
    }

    @GetMapping("/")
    public Collection<Room> findBooks() {
        return repository.getBooks();
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Room updateBook(
            @PathVariable("id") final String id, @RequestBody final Room book) {
        return book;
    }

}
