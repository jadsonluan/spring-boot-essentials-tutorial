package com.example.demo.error;

public class ResourceNotFoundDetails extends ErrorDetail{
    private String title;
    private int status;
    private String details;
    private long timestamp;
    private String developerMessage;

    private ResourceNotFoundDetails() {}

    public String getTitle() {
        return title;
    }

    public int getStatus() {
        return status;
    }

    public String getDetails() {
        return details;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public String getDeveloperMessage() {
        return developerMessage;
    }

    public static final class Builder {
        private String title;
        private int status;
        private String details;
        private long timestamp;
        private String developerMessage;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder status(int status) {
            this.status = status;
            return this;
        }

        public Builder details(String details) {
            this.details = details;
            return this;
        }

        public Builder timestamp(long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder developerMessage(String developerMessage) {
            this.developerMessage = developerMessage;
            return this;
        }

        public ResourceNotFoundDetails build() {
            ResourceNotFoundDetails resourceNotFoundDetails = new ResourceNotFoundDetails();
            resourceNotFoundDetails.setStatus(this.status);
            resourceNotFoundDetails.setDetails(this.details);
            resourceNotFoundDetails.setTitle(this.title);
            resourceNotFoundDetails.setDeveloperMessage(this.developerMessage);
            resourceNotFoundDetails.setTimestamp(this.timestamp);
            return resourceNotFoundDetails;
        }
    }
}
