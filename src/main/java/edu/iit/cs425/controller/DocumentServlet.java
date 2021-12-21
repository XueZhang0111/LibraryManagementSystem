package edu.iit.cs425.controller;

import edu.iit.cs425.bean.Classification;
import edu.iit.cs425.bean.Document;
import edu.iit.cs425.bean.Keyword;
import edu.iit.cs425.dao.DocumentMapper;
import edu.iit.cs425.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description: Document Servlet
 * @author: Xue Zhang
 * @date: 2021-12-05
 * @version: 1.0
 **/
@Controller
public class DocumentServlet {
    private DocumentService documentService;
    private DocumentMapper documentMapper;

    @Autowired
    public void setDocumentService(DocumentService documentService) {
        this.documentService = documentService;
    }

    @Autowired
    public void setDocumentMapper(DocumentMapper documentMapper) {
        this.documentMapper = documentMapper;
    }

    @RequestMapping("/docs")
    public String getAllDocs(Model model){
        List<Document> docs = documentMapper.getDocs();
        model.addAttribute("docs",docs);
//        for(Document doc: docs){
//            System.out.println(doc);
//        }
        return "doclist";
    }

    @RequestMapping("/toadd")
    public String addDocument() {
        return "add";
    }

    @RequestMapping("/save")
    public String saveDocument(Document document) {
        System.out.println(document);
        documentService.addDocument(document);
        return "redirect:/docs";
    }

    @RequestMapping(value="/doc/{id}",method=RequestMethod.DELETE)
    public String deleteDoc(@PathVariable("id")Integer id) {
        if(documentMapper.queryDocById(id) != null) {
            documentMapper.deleteDocById(id);
        }
        return "redirect:/docs";
    }

    @RequestMapping(value="/doc/{id}", method=RequestMethod.GET)
    public String getDoc(@PathVariable("id") Integer id, Model model) {
        Document doc = documentMapper.queryDocById(id);
        model.addAttribute("doc", doc);
        return "edit";
    }

    @RequestMapping(value = "/doc/{id}", method = RequestMethod.PUT)
    public String updateDoc(Document document) {
        System.out.println(document);
        documentMapper.updateDocById(document);
        return "redirect:/docs";
    }

    @ModelAttribute
    public void myModelAttribute(@RequestParam(value="id", required = false) Integer id, Model model){
        if(id != null) {
            Document document = documentMapper.queryDocById(id);
            model.addAttribute("document", document);
        }
    }
}
