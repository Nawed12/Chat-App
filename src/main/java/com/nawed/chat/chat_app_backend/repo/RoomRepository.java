package com.nawed.chat.chat_app_backend.repo;

import com.nawed.chat.chat_app_backend.entities.Room;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends MongoRepository<Room,String> {

    //get Room using room id
    Room findByRoomId(String roomId);
}
