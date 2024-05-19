package vn.roommanagement.api.repository;

import vn.roommanagement.api.entity.Room;

import java.util.Collection;
import java.util.Optional;

public interface RoomRepository {
    Optional<Object> findById(long id);

    Collection<Room> getBooks();
}
