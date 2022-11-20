package com.konstde00.oop_patterns.creational.builder.chain;

public class Account {

	private String userId;
    private String token;
    private Account() {
        // private constructor
    }

    public static Builder newBuilder() {
        return new Account().new Builder();
    }
    
    class Builder {

        private Builder() {}

        public Builder setUserId(String userId) {
            Account.this.userId = userId;
            return this;
        }

        public Builder setToken(String token) {
            Account.this.token = token;
            return this;
        }

        public Account build() {
            return Account.this;
        }
    }

    @Override
    public String toString() {
        return "Account [userId=" + userId + ", token=" + token + "]";
    }
}