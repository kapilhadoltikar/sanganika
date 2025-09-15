package com.chatapp.sanganika.chat;

import lombok.*;
import org.springframework.messaging.handler.annotation.SendTo;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatNotification {

    private String id;
    private String senderId;
    private String recipientId;
    private String content;
}
