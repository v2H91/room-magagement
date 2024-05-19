package vn.roommanagement.api.repository.impl;

import org.springframework.stereotype.Repository;
import vn.roommanagement.api.entity.Room;
import vn.roommanagement.api.repository.RoomRepository;

import java.util.Collection;
import java.util.Optional;

@Repository
public class RoomRepositoryImpl implements RoomRepository {

    @Override
    public Optional<Object> findById(long id) {
        return Optional.empty();
    }

    @Override
    public Collection<Room> getBooks() {
        return null;
    }

}
