package vn.roommanagement.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import vn.roommanagement.api.common.ResponseApi;
import vn.roommanagement.api.entity.Room;
import vn.roommanagement.api.repository.RoomRepository;

@RestController
@RequestMapping("api/test/v1/test")
public class TestApiController {

    @Autowired
    private RoomRepository repository;

    @GetMapping("/{id}")
    public ResponseApi findById(@PathVariable long id) throws Exception {
        return new ResponseApi(repository.findById(id)
                .orElseThrow(Exception::new));
    }

    @GetMapping("/")
    public ResponseApi findBooks() {
        return new ResponseApi(repository.findAll());
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Room updateBook(
            @PathVariable("id") final String id, @RequestBody final Room room) {
        return room;
    }

}
