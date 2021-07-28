package com.doi.news.model;

public class News {

    private String title;

    public static class Builder {

        private String title;

        public Builder() {}

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public News build() {
            return new News(this);
        }
    }

    private News(Builder builder) {
        this.title = builder.title;
    }
}
