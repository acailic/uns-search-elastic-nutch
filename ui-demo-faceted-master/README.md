#   Search with Elasticsearch, Angular.js  
 

## Installation

NodeJS and NPM are needed to install the rest, so first install

 - nodejs https://nodejs.org/en/download/
 - npm https://docs.npmjs.com/cli/install

Then, install node packages for gulp and bower with something like
`npm install --global gulp bower` (it might be necessary to run this as
superuser).

Then, change into poject folder and start npm and bower to fetch dependencies:

    $ cd src
    $ npm install
    $ bower install

This will install the project dependencies, after which you should be
able to start the developmend server with

    $ gulp serve

## Elasticsearch Server

Elasticsearch binaries are available at the Elasticsearch website:
[https://www.elastic.co/products/elasticsearch](https://www.elastic.co/products/elasticsearch "Elasticsearch Server Download")

Find the executables in `elasticsearch-2.1.0/bin` .

### Elasticsearch Server - Windows
exectue the file `elasticsearch-2.1.0\bin\elasticsearch.bat`


## Import documents

1. delete any old index (if you want to reload)

    curl -XDELETE 'localhost:9200/opendata?pretty'

2. create the index

    curl -XPUT 'localhost:9200/opendata?pretty'

3. create and load the mapping file

    curl -XPUT localhost:9200/opendata/statement/_mapping?pretty -d @data/mapping.json

4. load the json dataset

    curl -XPOST localhost:9200/opendata/statement/_bulk?pretty --data-binary @data/export-minimal.json

used project:

https://github.com/WebUX-Group5

# Project Screenshots:
<img src="/screenshots/application_native.png" width="358" height="532">
<img src="/screenshots/application_elasticui.png" width="358" height="532">
<img src="/screenshots/histogram_diagram.png" width="587" height="532">
<img src="/screenshots/top_words.png" width="244" height="532">
