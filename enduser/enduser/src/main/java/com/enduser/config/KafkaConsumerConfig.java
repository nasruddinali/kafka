package com.enduser.config;

import com.enduser.Constants;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration

public class KafkaConsumerConfig {

//    @Autowired
//    LoggerFactory loggerFactory
@KafkaListener(topics = Constants.LOCATION_UPDATE_TOPIC, groupId=Constants.GROUP_ID )
    public void updatedLocation(String location) {
        System.out.println(location);
    }
}
