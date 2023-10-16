# CMDocumentQuestionAndAnswer

A basic document question/answer pair for AI

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** | the organisation (its guid id). | 
**kb_id** | **str** | the knowledge-base id (guid) to use | 
**url** | **str** | The unique URL of a document. | 
**url_id** | **int** | The unique URL-ID of a document. | 
**conversation_list** | **str** | the context of the conversation thusfar | 
**answer** | **str** | The answer for the given question | 

## Example

```python
from openapi_client.models.cm_document_question_and_answer import CMDocumentQuestionAndAnswer

# TODO update the JSON string below
json = "{}"
# create an instance of CMDocumentQuestionAndAnswer from a JSON string
cm_document_question_and_answer_instance = CMDocumentQuestionAndAnswer.from_json(json)
# print the JSON string representation of the object
print CMDocumentQuestionAndAnswer.to_json()

# convert the object into a dict
cm_document_question_and_answer_dict = cm_document_question_and_answer_instance.to_dict()
# create an instance of CMDocumentQuestionAndAnswer from a dict
cm_document_question_and_answer_form_dict = cm_document_question_and_answer.from_dict(cm_document_question_and_answer_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


