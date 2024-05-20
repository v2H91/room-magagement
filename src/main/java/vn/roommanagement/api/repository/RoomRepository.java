package vn.roommanagement.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.roommanagement.api.entity.Room;
@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {

}
