package edu.iit.cs425.dao;

import edu.iit.cs425.bean.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @description: Document Mapper.
 * @author: Xue Zhang
 * @date: 2021-11-19
 * @version: 1.0
 **/
public interface DocumentMapper {
    void createDocument(Document document);
    void createDocKeyword(Keyword keyword);
    void createDocClassification(Classification classification);
    void createDocCopy(Copy copy);
    Integer createPublisher(Publisher publisher);
    Integer createAuthor(Author author);

    Integer createOneCopyDoc(Copy copy);
    Integer createBatchCopyDocs(Copy copy);

    Document getDocById(String title);
    Keyword getDocKeyword(String title);
    Classification getDocClassification(String title);
    Copy getOneCopy(String title, Integer id);
    List<Copy> getAllCopies(String title);

    Document queryDocByTitle(@Param("title") String title);
    Keyword queryKeyByWord(@Param("word") String word);
    Classification queryClassifyByName(@Param("phrase") String phrase);
    Publisher queryPublishByName(@Param("publisher_name") String publisher_name);
    Author queryAuthorByName(@Param("aname") String aname);
    List<Document> getDocs();

    void deleteDocById(@Param("id") Integer id);

    Document queryDocById(@Param("id") Integer id);

    void updateDocById(Document document);
}
