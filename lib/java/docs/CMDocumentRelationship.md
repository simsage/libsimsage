

# CMDocumentRelationship

A document that related to this document in some fashion (parent or child)

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**urlId** | **Integer** | the url-id of this document |  |
|**isChild** | **Boolean** | if true, this is a child relationship, otherwise a parent relationship |  |
|**relatedUrlId** | **Integer** | the related document&#39;s id |  |
|**relatedUrl** | **String** | the url of the related document |  |
|**webUrl** | **String** | the web-url (if set) if there is a web-link for this document |  |
|**title** | **String** | the title of the related document for display |  |
|**binarySize** | **Long** | size in bytes of the related document |  |
|**documentType** | **String** | the type of the related document |  |
|**created** | **Long** | The unix creation date-time of the related item |  |
|**lastModified** | **Long** | The unix last-modified date-time of the related item |  |
|**child** | **Boolean** |  |  [optional] |



