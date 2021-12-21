package edu.iit.cs425.service;

import edu.iit.cs425.bean.*;
import edu.iit.cs425.dao.DocumentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: TODO
 * @author: Xue Zhang
 * @date: 2021-11-19
 * @version: 1.0
 **/
public interface DocumentService {

    Integer addDocument(Document document);
    Integer addDocKeyword(Keyword keyword);
    Integer addDocClassification(Classification classification);
    Integer addDocCopy(Copy copy);
    Integer addPublisher(Publisher publisher);
    Integer addAuthor(Author author);



}
