package com.agroknow.bdg;

import com.agroknow.bdg.model.BDGResource;
import com.yoshtec.owl.marshall.Marshaller;
import org.semanticweb.owlapi.model.IRI;

import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Test {

    public static void main(String[] args) throws Exception {

        Collection<BDGResource> resources = new ArrayList<>();

        BDGResource resource = new BDGResource();
        resource.setId("123");
        resources.add(resource);

        Marshaller marshaller = new Marshaller();
        marshaller.marshal(resources, IRI.create("MyOntology.owl"),
                IRI.create(new File("./", "MyOntology.owl")));

    }

}
