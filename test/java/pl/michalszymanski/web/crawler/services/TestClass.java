/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.michalszymanski.web.crawler.services;

import pl.michalszymanski.web.crawler.model.ValidURL;

/**
 *
 * @author Michał Szymański, kontakt: michal.szymanski.aajar@gmail.com
 */
public class TestClass {
   @ValidURL
        String url;

        public TestClass(String url) {
            this.url = url;
        }
}
