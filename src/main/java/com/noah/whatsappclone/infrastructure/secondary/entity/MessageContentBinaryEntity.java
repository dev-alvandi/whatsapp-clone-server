package com.noah.whatsappclone.infrastructure.secondary.entity;

import com.noah.whatsappclone.messaging.domain.message.valueObject.MessageContent;
import com.noah.whatsappclone.shared.jpa.AbstractAuditingEntity;
import jakarta.persistence.*;
import org.jilt.Builder;

import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "message_binary_content")
@Builder
public class MessageContentBinaryEntity extends AbstractAuditingEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "messageContentBinarySequenceGenerator")
    @SequenceGenerator(name = "messageContentBinarySequenceGenerator",
            sequenceName = "message_binary_content_sequence", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @Lob
    @Column(name = "file", nullable = false)
    private byte[] file;

    @Column(name = "file_content_type")
    private String fileContentType;

    @OneToOne(mappedBy = "contentBinary")
    private MessageEntity message;


    public MessageContentBinaryEntity() {
    }

    public MessageContentBinaryEntity(Long id, byte[] file, String fileContentType, MessageEntity message) {
        this.id = id;
        this.file = file;
        this.fileContentType = fileContentType;
        this.message = message;
    }

    public static MessageContentBinaryEntity from(MessageContent messageContent) {
        return MessageContentBinaryEntityBuilder.messageContentBinaryEntity()
                .fileContentType(messageContent.media().mimetype())
                .file(messageContent.media().file())
                .build();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }

    public String getFileContentType() {
        return fileContentType;
    }

    public void setFileContentType(String fileContentType) {
        this.fileContentType = fileContentType;
    }

    public MessageEntity getMessage() {
        return message;
    }

    public void setMessage(MessageEntity message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MessageContentBinaryEntity that = (MessageContentBinaryEntity) o;
        return Arrays.equals(getFile(),
                that.getFile()) && Objects.equals(getFileContentType(),
                that.getFileContentType());
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(getFile());
        result = 31 * result + Objects.hashCode(getFileContentType());
        return result;
    }
}