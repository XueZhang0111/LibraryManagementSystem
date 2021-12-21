package edu.iit.cs425.service.impl;

import edu.iit.cs425.bean.*;
import edu.iit.cs425.dao.DocumentMapper;
import edu.iit.cs425.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: Document Service
 * @author: Xue Zhang
 * @date: 2021-12-10
 * @version: 1.0
 **/
@Service
public class DocumentServiceImpl implements DocumentService {

    private DocumentMapper documentMapper;

    @Autowired
    public void setDocumentMapper(DocumentMapper documentMapper) {
        this.documentMapper = documentMapper;
    }

    @Override
    public Integer addDocument(Document document) {
        System.out.println(document);
        if(documentMapper.queryDocByTitle(document.getTitle()) == null) {
            documentMapper.createDocument(document);
        }
        return 0;
    }

    @Override
    public Integer addDocKeyword(Keyword keyword) {
        if(documentMapper.queryKeyByWord(keyword.getWords()) == null) {
            documentMapper.createDocKeyword(keyword);
        }
        return 1;
    }

    @Override
    public Integer addDocClassification(Classification classification) {
        if(documentMapper.queryClassifyByName(classification.getPhrase()) == null) {
            documentMapper.createDocClassification(classification);
        };
        return 0;
    }

    @Override
    public Integer addDocCopy(Copy copy) {
        documentMapper.createDocCopy(copy);
        return 0;
    }

    @Override
    public Integer addPublisher(Publisher publisher) {
        if(documentMapper.queryPublishByName(publisher.getPublisher_name()) == null) {
            documentMapper.createPublisher(publisher);
        }
        return 0;
    }

    @Override
    public Integer addAuthor(Author author) {
        if(documentMapper.queryAuthorByName(author.getAname()) == null) {
            documentMapper.createAuthor(author);
        }
        return 0;
    }

}
