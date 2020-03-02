package com.snupa.domain.dynamo

import com.amazonaws.services.dynamodbv2.datamodeling.*
import com.snupa.util.LocalDateTimeConverter
import java.time.LocalDateTime

@DynamoDBTable(tableName = "snupa_setting")
data class Setting_ddb(
        @DynamoDBHashKey(attributeName = "id")
        @DynamoDBAutoGeneratedKey
        private var id : String? = null,

        @DynamoDBAttribute
        private var name : String,

        @DynamoDBAttribute
        private var nickName : String,

        @DynamoDBAttribute
        private var email : String,

        // profile image's url  ex) "s3://blablbalbal.com"
        @DynamoDBAttribute
        private var avartar : String,

        @DynamoDBAttribute
        private var description : String,

        @DynamoDBAttribute
        private var emailVerified : Boolean,

        @DynamoDBAttribute
        @DynamoDBTypeConverted(converter = LocalDateTimeConverter::class)
        private var createdAt: LocalDateTime,

        @DynamoDBAttribute
        @DynamoDBTypeConverted(converter = LocalDateTimeConverter::class)
        private var updatedAt: LocalDateTime
)


//data class UserProfile(
//        private var name : String,
//        private var nickName : String,
//        private var email : String,
//
//        // profile image's url  ex) "s3://blablbalbal.com"
//        private var avartar : String,
//        private var description : String
//)