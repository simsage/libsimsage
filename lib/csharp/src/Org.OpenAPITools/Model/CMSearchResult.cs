/*
 * SimSage REST API
 *
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.12.19
 * Contact: info@simsage.co.uk
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// A single search result from the Semantic Search engine.  This presents a hit inside a SimSage document.
    /// </summary>
    [DataContract(Name = "CMSearchResult")]
    public partial class CMSearchResult : IEquatable<CMSearchResult>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMSearchResult" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMSearchResult() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMSearchResult" /> class.
        /// </summary>
        /// <param name="kbId">the knowledge-base id (its guid id) (required).</param>
        /// <param name="url">the url of the document that matched (required).</param>
        /// <param name="urlId">the internal SimSage id for this url (unique only within a knowledge-base) (required).</param>
        /// <param name="sourceId">the source-id of this result (ie. the source&#39;s id) (required).</param>
        /// <param name="title">the title of this document/record (can be empty) (required).</param>
        /// <param name="author">the author of this document/record (can be empty) (required).</param>
        /// <param name="textList">A list of matching fragments in this document, with highlight markers. (required).</param>
        /// <param name="textIndex">in case of multiple matches in textList, the best match index of these items starting at zero (0) (required).</param>
        /// <param name="score">the relative score of this match, the bigger, the better (required).</param>
        /// <param name="sortDesc">was this document along with any others sorted ascending or descending? (required).</param>
        /// <param name="qnaResult">is this item a Q&amp;A result or a search result? (required).</param>
        /// <param name="firstSentence">the id of the first sentence in this result (required).</param>
        /// <param name="created">document creation date-time as a unix date-time (required).</param>
        /// <param name="uploaded">document uploaded to SimSage date-time as a unix date-time (required).</param>
        /// <param name="lastModified">document last-modified date-time as a unix date-time (required).</param>
        /// <param name="documentType">the type of this document/record as a three or four letter file extension (required).</param>
        /// <param name="numSentences">the total number of sentences in the body of this document (required).</param>
        /// <param name="numWords">the total number of words and tokens (eg. &#39;.&#39;) in the body of this document (required).</param>
        /// <param name="numRelationships">the total number of relationships expanded from the words in this document (required).</param>
        /// <param name="binarySize">the binary-size of the original document in bytes (required).</param>
        /// <param name="textSize">the text-size of the original document in number of characters (required).</param>
        /// <param name="fileType">the DROID file-type of this document/record (can be empty) (required).</param>
        /// <param name="crawled">document crawled (ie. picked up by SimSage) date-time as a unix date-time (required).</param>
        /// <param name="converted">document conversion (ie. turned into text by SimSage) date-time as a unix date-time (required).</param>
        /// <param name="parsed">document parsed (ie. language analyzed by SimSage) date-time as a unix date-time (required).</param>
        /// <param name="indexed">document indexed (ie. creation of inverted indices by SimSage) date-time as a unix date-time (required).</param>
        /// <param name="previewed">document preview generated (ie. creation of thumb-nail images for this document by SimSage) date-time as a unix date-time (required).</param>
        /// <param name="similarDocumentList">A list of similar documents matched by this query. (required).</param>
        /// <param name="relatedList">A list of similar documents matched by this query. (required).</param>
        /// <param name="metadata">A set of name-values of metadata associated with this document (required).</param>
        /// <param name="filename">the filename of this document in the DMS system (required).</param>
        /// <param name="folderId">the folderId of this item in the DMS system (required).</param>
        /// <param name="renderType">how should this item be rendered? (default \&quot;rt search\&quot;) (required).</param>
        public CMSearchResult(string kbId = default(string), string url = default(string), int urlId = default(int), int sourceId = default(int), string title = default(string), string author = default(string), List<string> textList = default(List<string>), int textIndex = default(int), float score = default(float), bool sortDesc = default(bool), bool qnaResult = default(bool), int firstSentence = default(int), long created = default(long), long uploaded = default(long), long lastModified = default(long), string documentType = default(string), int numSentences = default(int), int numWords = default(int), int numRelationships = default(int), long binarySize = default(long), int textSize = default(int), string fileType = default(string), long crawled = default(long), long converted = default(long), long parsed = default(long), long indexed = default(long), long previewed = default(long), List<CMSimilarDocument> similarDocumentList = default(List<CMSimilarDocument>), List<CMDocumentRelationship> relatedList = default(List<CMDocumentRelationship>), Dictionary<string, string> metadata = default(Dictionary<string, string>), string filename = default(string), string folderId = default(string), string renderType = default(string))
        {
            // to ensure "kbId" is required (not null)
            if (kbId == null)
            {
                throw new ArgumentNullException("kbId is a required property for CMSearchResult and cannot be null");
            }
            this.KbId = kbId;
            // to ensure "url" is required (not null)
            if (url == null)
            {
                throw new ArgumentNullException("url is a required property for CMSearchResult and cannot be null");
            }
            this.Url = url;
            this.UrlId = urlId;
            this.SourceId = sourceId;
            // to ensure "title" is required (not null)
            if (title == null)
            {
                throw new ArgumentNullException("title is a required property for CMSearchResult and cannot be null");
            }
            this.Title = title;
            // to ensure "author" is required (not null)
            if (author == null)
            {
                throw new ArgumentNullException("author is a required property for CMSearchResult and cannot be null");
            }
            this.Author = author;
            // to ensure "textList" is required (not null)
            if (textList == null)
            {
                throw new ArgumentNullException("textList is a required property for CMSearchResult and cannot be null");
            }
            this.TextList = textList;
            this.TextIndex = textIndex;
            this.Score = score;
            this.SortDesc = sortDesc;
            this.QnaResult = qnaResult;
            this.FirstSentence = firstSentence;
            this.Created = created;
            this.Uploaded = uploaded;
            this.LastModified = lastModified;
            // to ensure "documentType" is required (not null)
            if (documentType == null)
            {
                throw new ArgumentNullException("documentType is a required property for CMSearchResult and cannot be null");
            }
            this.DocumentType = documentType;
            this.NumSentences = numSentences;
            this.NumWords = numWords;
            this.NumRelationships = numRelationships;
            this.BinarySize = binarySize;
            this.TextSize = textSize;
            // to ensure "fileType" is required (not null)
            if (fileType == null)
            {
                throw new ArgumentNullException("fileType is a required property for CMSearchResult and cannot be null");
            }
            this.FileType = fileType;
            this.Crawled = crawled;
            this.Converted = converted;
            this.Parsed = parsed;
            this.Indexed = indexed;
            this.Previewed = previewed;
            // to ensure "similarDocumentList" is required (not null)
            if (similarDocumentList == null)
            {
                throw new ArgumentNullException("similarDocumentList is a required property for CMSearchResult and cannot be null");
            }
            this.SimilarDocumentList = similarDocumentList;
            // to ensure "relatedList" is required (not null)
            if (relatedList == null)
            {
                throw new ArgumentNullException("relatedList is a required property for CMSearchResult and cannot be null");
            }
            this.RelatedList = relatedList;
            // to ensure "metadata" is required (not null)
            if (metadata == null)
            {
                throw new ArgumentNullException("metadata is a required property for CMSearchResult and cannot be null");
            }
            this.Metadata = metadata;
            // to ensure "filename" is required (not null)
            if (filename == null)
            {
                throw new ArgumentNullException("filename is a required property for CMSearchResult and cannot be null");
            }
            this.Filename = filename;
            // to ensure "folderId" is required (not null)
            if (folderId == null)
            {
                throw new ArgumentNullException("folderId is a required property for CMSearchResult and cannot be null");
            }
            this.FolderId = folderId;
            // to ensure "renderType" is required (not null)
            if (renderType == null)
            {
                throw new ArgumentNullException("renderType is a required property for CMSearchResult and cannot be null");
            }
            this.RenderType = renderType;
        }

        /// <summary>
        /// the knowledge-base id (its guid id)
        /// </summary>
        /// <value>the knowledge-base id (its guid id)</value>
        /// <example>00000000-0000-0000-0000-000000000001</example>
        [DataMember(Name = "kbId", IsRequired = true, EmitDefaultValue = true)]
        public string KbId { get; set; }

        /// <summary>
        /// the url of the document that matched
        /// </summary>
        /// <value>the url of the document that matched</value>
        /// <example>https://simsage.ai/some/document.pdf</example>
        [DataMember(Name = "url", IsRequired = true, EmitDefaultValue = true)]
        public string Url { get; set; }

        /// <summary>
        /// the internal SimSage id for this url (unique only within a knowledge-base)
        /// </summary>
        /// <value>the internal SimSage id for this url (unique only within a knowledge-base)</value>
        /// <example>22</example>
        [DataMember(Name = "urlId", IsRequired = true, EmitDefaultValue = true)]
        public int UrlId { get; set; }

        /// <summary>
        /// the source-id of this result (ie. the source&#39;s id)
        /// </summary>
        /// <value>the source-id of this result (ie. the source&#39;s id)</value>
        /// <example>1</example>
        [DataMember(Name = "sourceId", IsRequired = true, EmitDefaultValue = true)]
        public int SourceId { get; set; }

        /// <summary>
        /// the title of this document/record (can be empty)
        /// </summary>
        /// <value>the title of this document/record (can be empty)</value>
        /// <example>my little pony returns</example>
        [DataMember(Name = "title", IsRequired = true, EmitDefaultValue = true)]
        public string Title { get; set; }

        /// <summary>
        /// the author of this document/record (can be empty)
        /// </summary>
        /// <value>the author of this document/record (can be empty)</value>
        /// <example>John Elderberries</example>
        [DataMember(Name = "author", IsRequired = true, EmitDefaultValue = true)]
        public string Author { get; set; }

        /// <summary>
        /// A list of matching fragments in this document, with highlight markers.
        /// </summary>
        /// <value>A list of matching fragments in this document, with highlight markers.</value>
        /// <example>[&quot;The little ponies were very excited.&quot;]</example>
        [DataMember(Name = "textList", IsRequired = true, EmitDefaultValue = true)]
        public List<string> TextList { get; set; }

        /// <summary>
        /// in case of multiple matches in textList, the best match index of these items starting at zero (0)
        /// </summary>
        /// <value>in case of multiple matches in textList, the best match index of these items starting at zero (0)</value>
        /// <example>0</example>
        [DataMember(Name = "textIndex", IsRequired = true, EmitDefaultValue = true)]
        public int TextIndex { get; set; }

        /// <summary>
        /// the relative score of this match, the bigger, the better
        /// </summary>
        /// <value>the relative score of this match, the bigger, the better</value>
        /// <example>231.22</example>
        [DataMember(Name = "score", IsRequired = true, EmitDefaultValue = true)]
        public float Score { get; set; }

        /// <summary>
        /// was this document along with any others sorted ascending or descending?
        /// </summary>
        /// <value>was this document along with any others sorted ascending or descending?</value>
        /// <example>true</example>
        [DataMember(Name = "sortDesc", IsRequired = true, EmitDefaultValue = true)]
        public bool SortDesc { get; set; }

        /// <summary>
        /// is this item a Q&amp;A result or a search result?
        /// </summary>
        /// <value>is this item a Q&amp;A result or a search result?</value>
        /// <example>false</example>
        [DataMember(Name = "qnaResult", IsRequired = true, EmitDefaultValue = true)]
        public bool QnaResult { get; set; }

        /// <summary>
        /// the id of the first sentence in this result
        /// </summary>
        /// <value>the id of the first sentence in this result</value>
        /// <example>0</example>
        [DataMember(Name = "firstSentence", IsRequired = true, EmitDefaultValue = true)]
        public int FirstSentence { get; set; }

        /// <summary>
        /// document creation date-time as a unix date-time
        /// </summary>
        /// <value>document creation date-time as a unix date-time</value>
        /// <example>0</example>
        [DataMember(Name = "created", IsRequired = true, EmitDefaultValue = true)]
        public long Created { get; set; }

        /// <summary>
        /// document uploaded to SimSage date-time as a unix date-time
        /// </summary>
        /// <value>document uploaded to SimSage date-time as a unix date-time</value>
        /// <example>0</example>
        [DataMember(Name = "uploaded", IsRequired = true, EmitDefaultValue = true)]
        public long Uploaded { get; set; }

        /// <summary>
        /// document last-modified date-time as a unix date-time
        /// </summary>
        /// <value>document last-modified date-time as a unix date-time</value>
        /// <example>0</example>
        [DataMember(Name = "lastModified", IsRequired = true, EmitDefaultValue = true)]
        public long LastModified { get; set; }

        /// <summary>
        /// the type of this document/record as a three or four letter file extension
        /// </summary>
        /// <value>the type of this document/record as a three or four letter file extension</value>
        /// <example>pdf</example>
        [DataMember(Name = "documentType", IsRequired = true, EmitDefaultValue = true)]
        public string DocumentType { get; set; }

        /// <summary>
        /// the total number of sentences in the body of this document
        /// </summary>
        /// <value>the total number of sentences in the body of this document</value>
        /// <example>3121</example>
        [DataMember(Name = "numSentences", IsRequired = true, EmitDefaultValue = true)]
        public int NumSentences { get; set; }

        /// <summary>
        /// the total number of words and tokens (eg. &#39;.&#39;) in the body of this document
        /// </summary>
        /// <value>the total number of words and tokens (eg. &#39;.&#39;) in the body of this document</value>
        /// <example>31211</example>
        [DataMember(Name = "numWords", IsRequired = true, EmitDefaultValue = true)]
        public int NumWords { get; set; }

        /// <summary>
        /// the total number of relationships expanded from the words in this document
        /// </summary>
        /// <value>the total number of relationships expanded from the words in this document</value>
        /// <example>231211</example>
        [DataMember(Name = "numRelationships", IsRequired = true, EmitDefaultValue = true)]
        public int NumRelationships { get; set; }

        /// <summary>
        /// the binary-size of the original document in bytes
        /// </summary>
        /// <value>the binary-size of the original document in bytes</value>
        /// <example>31211</example>
        [DataMember(Name = "binarySize", IsRequired = true, EmitDefaultValue = true)]
        public long BinarySize { get; set; }

        /// <summary>
        /// the text-size of the original document in number of characters
        /// </summary>
        /// <value>the text-size of the original document in number of characters</value>
        /// <example>31211</example>
        [DataMember(Name = "textSize", IsRequired = true, EmitDefaultValue = true)]
        public int TextSize { get; set; }

        /// <summary>
        /// the DROID file-type of this document/record (can be empty)
        /// </summary>
        /// <value>the DROID file-type of this document/record (can be empty)</value>
        /// <example>Acrobat PDF 1.0.1</example>
        [DataMember(Name = "fileType", IsRequired = true, EmitDefaultValue = true)]
        public string FileType { get; set; }

        /// <summary>
        /// document crawled (ie. picked up by SimSage) date-time as a unix date-time
        /// </summary>
        /// <value>document crawled (ie. picked up by SimSage) date-time as a unix date-time</value>
        /// <example>0</example>
        [DataMember(Name = "crawled", IsRequired = true, EmitDefaultValue = true)]
        public long Crawled { get; set; }

        /// <summary>
        /// document conversion (ie. turned into text by SimSage) date-time as a unix date-time
        /// </summary>
        /// <value>document conversion (ie. turned into text by SimSage) date-time as a unix date-time</value>
        /// <example>0</example>
        [DataMember(Name = "converted", IsRequired = true, EmitDefaultValue = true)]
        public long Converted { get; set; }

        /// <summary>
        /// document parsed (ie. language analyzed by SimSage) date-time as a unix date-time
        /// </summary>
        /// <value>document parsed (ie. language analyzed by SimSage) date-time as a unix date-time</value>
        /// <example>0</example>
        [DataMember(Name = "parsed", IsRequired = true, EmitDefaultValue = true)]
        public long Parsed { get; set; }

        /// <summary>
        /// document indexed (ie. creation of inverted indices by SimSage) date-time as a unix date-time
        /// </summary>
        /// <value>document indexed (ie. creation of inverted indices by SimSage) date-time as a unix date-time</value>
        /// <example>0</example>
        [DataMember(Name = "indexed", IsRequired = true, EmitDefaultValue = true)]
        public long Indexed { get; set; }

        /// <summary>
        /// document preview generated (ie. creation of thumb-nail images for this document by SimSage) date-time as a unix date-time
        /// </summary>
        /// <value>document preview generated (ie. creation of thumb-nail images for this document by SimSage) date-time as a unix date-time</value>
        /// <example>0</example>
        [DataMember(Name = "previewed", IsRequired = true, EmitDefaultValue = true)]
        public long Previewed { get; set; }

        /// <summary>
        /// A list of similar documents matched by this query.
        /// </summary>
        /// <value>A list of similar documents matched by this query.</value>
        [DataMember(Name = "similarDocumentList", IsRequired = true, EmitDefaultValue = true)]
        public List<CMSimilarDocument> SimilarDocumentList { get; set; }

        /// <summary>
        /// A list of similar documents matched by this query.
        /// </summary>
        /// <value>A list of similar documents matched by this query.</value>
        [DataMember(Name = "relatedList", IsRequired = true, EmitDefaultValue = true)]
        public List<CMDocumentRelationship> RelatedList { get; set; }

        /// <summary>
        /// A set of name-values of metadata associated with this document
        /// </summary>
        /// <value>A set of name-values of metadata associated with this document</value>
        /// <example>{&quot;person&quot;:3,&quot;ms-file-type&quot;:&quot;doc&quot;}</example>
        [DataMember(Name = "metadata", IsRequired = true, EmitDefaultValue = true)]
        public Dictionary<string, string> Metadata { get; set; }

        /// <summary>
        /// the filename of this document in the DMS system
        /// </summary>
        /// <value>the filename of this document in the DMS system</value>
        /// <example>index.html</example>
        [DataMember(Name = "filename", IsRequired = true, EmitDefaultValue = true)]
        public string Filename { get; set; }

        /// <summary>
        /// the folderId of this item in the DMS system
        /// </summary>
        /// <value>the folderId of this item in the DMS system</value>
        /// <example>(a guid)</example>
        [DataMember(Name = "folderId", IsRequired = true, EmitDefaultValue = true)]
        public string FolderId { get; set; }

        /// <summary>
        /// how should this item be rendered? (default \&quot;rt search\&quot;)
        /// </summary>
        /// <value>how should this item be rendered? (default \&quot;rt search\&quot;)</value>
        /// <example>rt search</example>
        [DataMember(Name = "renderType", IsRequired = true, EmitDefaultValue = true)]
        public string RenderType { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMSearchResult {\n");
            sb.Append("  KbId: ").Append(KbId).Append("\n");
            sb.Append("  Url: ").Append(Url).Append("\n");
            sb.Append("  UrlId: ").Append(UrlId).Append("\n");
            sb.Append("  SourceId: ").Append(SourceId).Append("\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
            sb.Append("  Author: ").Append(Author).Append("\n");
            sb.Append("  TextList: ").Append(TextList).Append("\n");
            sb.Append("  TextIndex: ").Append(TextIndex).Append("\n");
            sb.Append("  Score: ").Append(Score).Append("\n");
            sb.Append("  SortDesc: ").Append(SortDesc).Append("\n");
            sb.Append("  QnaResult: ").Append(QnaResult).Append("\n");
            sb.Append("  FirstSentence: ").Append(FirstSentence).Append("\n");
            sb.Append("  Created: ").Append(Created).Append("\n");
            sb.Append("  Uploaded: ").Append(Uploaded).Append("\n");
            sb.Append("  LastModified: ").Append(LastModified).Append("\n");
            sb.Append("  DocumentType: ").Append(DocumentType).Append("\n");
            sb.Append("  NumSentences: ").Append(NumSentences).Append("\n");
            sb.Append("  NumWords: ").Append(NumWords).Append("\n");
            sb.Append("  NumRelationships: ").Append(NumRelationships).Append("\n");
            sb.Append("  BinarySize: ").Append(BinarySize).Append("\n");
            sb.Append("  TextSize: ").Append(TextSize).Append("\n");
            sb.Append("  FileType: ").Append(FileType).Append("\n");
            sb.Append("  Crawled: ").Append(Crawled).Append("\n");
            sb.Append("  Converted: ").Append(Converted).Append("\n");
            sb.Append("  Parsed: ").Append(Parsed).Append("\n");
            sb.Append("  Indexed: ").Append(Indexed).Append("\n");
            sb.Append("  Previewed: ").Append(Previewed).Append("\n");
            sb.Append("  SimilarDocumentList: ").Append(SimilarDocumentList).Append("\n");
            sb.Append("  RelatedList: ").Append(RelatedList).Append("\n");
            sb.Append("  Metadata: ").Append(Metadata).Append("\n");
            sb.Append("  Filename: ").Append(Filename).Append("\n");
            sb.Append("  FolderId: ").Append(FolderId).Append("\n");
            sb.Append("  RenderType: ").Append(RenderType).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as CMSearchResult);
        }

        /// <summary>
        /// Returns true if CMSearchResult instances are equal
        /// </summary>
        /// <param name="input">Instance of CMSearchResult to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMSearchResult input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.KbId == input.KbId ||
                    (this.KbId != null &&
                    this.KbId.Equals(input.KbId))
                ) && 
                (
                    this.Url == input.Url ||
                    (this.Url != null &&
                    this.Url.Equals(input.Url))
                ) && 
                (
                    this.UrlId == input.UrlId ||
                    this.UrlId.Equals(input.UrlId)
                ) && 
                (
                    this.SourceId == input.SourceId ||
                    this.SourceId.Equals(input.SourceId)
                ) && 
                (
                    this.Title == input.Title ||
                    (this.Title != null &&
                    this.Title.Equals(input.Title))
                ) && 
                (
                    this.Author == input.Author ||
                    (this.Author != null &&
                    this.Author.Equals(input.Author))
                ) && 
                (
                    this.TextList == input.TextList ||
                    this.TextList != null &&
                    input.TextList != null &&
                    this.TextList.SequenceEqual(input.TextList)
                ) && 
                (
                    this.TextIndex == input.TextIndex ||
                    this.TextIndex.Equals(input.TextIndex)
                ) && 
                (
                    this.Score == input.Score ||
                    this.Score.Equals(input.Score)
                ) && 
                (
                    this.SortDesc == input.SortDesc ||
                    this.SortDesc.Equals(input.SortDesc)
                ) && 
                (
                    this.QnaResult == input.QnaResult ||
                    this.QnaResult.Equals(input.QnaResult)
                ) && 
                (
                    this.FirstSentence == input.FirstSentence ||
                    this.FirstSentence.Equals(input.FirstSentence)
                ) && 
                (
                    this.Created == input.Created ||
                    this.Created.Equals(input.Created)
                ) && 
                (
                    this.Uploaded == input.Uploaded ||
                    this.Uploaded.Equals(input.Uploaded)
                ) && 
                (
                    this.LastModified == input.LastModified ||
                    this.LastModified.Equals(input.LastModified)
                ) && 
                (
                    this.DocumentType == input.DocumentType ||
                    (this.DocumentType != null &&
                    this.DocumentType.Equals(input.DocumentType))
                ) && 
                (
                    this.NumSentences == input.NumSentences ||
                    this.NumSentences.Equals(input.NumSentences)
                ) && 
                (
                    this.NumWords == input.NumWords ||
                    this.NumWords.Equals(input.NumWords)
                ) && 
                (
                    this.NumRelationships == input.NumRelationships ||
                    this.NumRelationships.Equals(input.NumRelationships)
                ) && 
                (
                    this.BinarySize == input.BinarySize ||
                    this.BinarySize.Equals(input.BinarySize)
                ) && 
                (
                    this.TextSize == input.TextSize ||
                    this.TextSize.Equals(input.TextSize)
                ) && 
                (
                    this.FileType == input.FileType ||
                    (this.FileType != null &&
                    this.FileType.Equals(input.FileType))
                ) && 
                (
                    this.Crawled == input.Crawled ||
                    this.Crawled.Equals(input.Crawled)
                ) && 
                (
                    this.Converted == input.Converted ||
                    this.Converted.Equals(input.Converted)
                ) && 
                (
                    this.Parsed == input.Parsed ||
                    this.Parsed.Equals(input.Parsed)
                ) && 
                (
                    this.Indexed == input.Indexed ||
                    this.Indexed.Equals(input.Indexed)
                ) && 
                (
                    this.Previewed == input.Previewed ||
                    this.Previewed.Equals(input.Previewed)
                ) && 
                (
                    this.SimilarDocumentList == input.SimilarDocumentList ||
                    this.SimilarDocumentList != null &&
                    input.SimilarDocumentList != null &&
                    this.SimilarDocumentList.SequenceEqual(input.SimilarDocumentList)
                ) && 
                (
                    this.RelatedList == input.RelatedList ||
                    this.RelatedList != null &&
                    input.RelatedList != null &&
                    this.RelatedList.SequenceEqual(input.RelatedList)
                ) && 
                (
                    this.Metadata == input.Metadata ||
                    this.Metadata != null &&
                    input.Metadata != null &&
                    this.Metadata.SequenceEqual(input.Metadata)
                ) && 
                (
                    this.Filename == input.Filename ||
                    (this.Filename != null &&
                    this.Filename.Equals(input.Filename))
                ) && 
                (
                    this.FolderId == input.FolderId ||
                    (this.FolderId != null &&
                    this.FolderId.Equals(input.FolderId))
                ) && 
                (
                    this.RenderType == input.RenderType ||
                    (this.RenderType != null &&
                    this.RenderType.Equals(input.RenderType))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.KbId != null)
                {
                    hashCode = (hashCode * 59) + this.KbId.GetHashCode();
                }
                if (this.Url != null)
                {
                    hashCode = (hashCode * 59) + this.Url.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.UrlId.GetHashCode();
                hashCode = (hashCode * 59) + this.SourceId.GetHashCode();
                if (this.Title != null)
                {
                    hashCode = (hashCode * 59) + this.Title.GetHashCode();
                }
                if (this.Author != null)
                {
                    hashCode = (hashCode * 59) + this.Author.GetHashCode();
                }
                if (this.TextList != null)
                {
                    hashCode = (hashCode * 59) + this.TextList.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.TextIndex.GetHashCode();
                hashCode = (hashCode * 59) + this.Score.GetHashCode();
                hashCode = (hashCode * 59) + this.SortDesc.GetHashCode();
                hashCode = (hashCode * 59) + this.QnaResult.GetHashCode();
                hashCode = (hashCode * 59) + this.FirstSentence.GetHashCode();
                hashCode = (hashCode * 59) + this.Created.GetHashCode();
                hashCode = (hashCode * 59) + this.Uploaded.GetHashCode();
                hashCode = (hashCode * 59) + this.LastModified.GetHashCode();
                if (this.DocumentType != null)
                {
                    hashCode = (hashCode * 59) + this.DocumentType.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.NumSentences.GetHashCode();
                hashCode = (hashCode * 59) + this.NumWords.GetHashCode();
                hashCode = (hashCode * 59) + this.NumRelationships.GetHashCode();
                hashCode = (hashCode * 59) + this.BinarySize.GetHashCode();
                hashCode = (hashCode * 59) + this.TextSize.GetHashCode();
                if (this.FileType != null)
                {
                    hashCode = (hashCode * 59) + this.FileType.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Crawled.GetHashCode();
                hashCode = (hashCode * 59) + this.Converted.GetHashCode();
                hashCode = (hashCode * 59) + this.Parsed.GetHashCode();
                hashCode = (hashCode * 59) + this.Indexed.GetHashCode();
                hashCode = (hashCode * 59) + this.Previewed.GetHashCode();
                if (this.SimilarDocumentList != null)
                {
                    hashCode = (hashCode * 59) + this.SimilarDocumentList.GetHashCode();
                }
                if (this.RelatedList != null)
                {
                    hashCode = (hashCode * 59) + this.RelatedList.GetHashCode();
                }
                if (this.Metadata != null)
                {
                    hashCode = (hashCode * 59) + this.Metadata.GetHashCode();
                }
                if (this.Filename != null)
                {
                    hashCode = (hashCode * 59) + this.Filename.GetHashCode();
                }
                if (this.FolderId != null)
                {
                    hashCode = (hashCode * 59) + this.FolderId.GetHashCode();
                }
                if (this.RenderType != null)
                {
                    hashCode = (hashCode * 59) + this.RenderType.GetHashCode();
                }
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
