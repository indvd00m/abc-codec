# ABC Codec

## Using
Add repository to your POM:

```xml
	<repository>
		<id>indvd00m-github-repo</id>
		<url>https://github.com/indvd00m/maven-repo/raw/master/repository</url>
	</repository>
```

Add dependency to your maven project:

```xml
	<dependency>
		<groupId>com.indvd00m.codec</groupId>
		<artifactId>abc-codec</artifactId>
		<version>1.1.0</version>
	</dependency>
```

## CI
Maven artifacts are built via Travis: 
[![Build Status](https://travis-ci.org/indvd00m/abc-codec.svg?branch=master)](https://travis-ci.org/indvd00m/abc-codec)

## Download release

https://github.com/indvd00m/abc-codec/releases

## Release notes

### Version 1.0.0
- First release.

### Version 1.1.0
- Decode optimizations.
- Add exceptions throwing.

### Version 1.1.1
- Fix building under jdk6.

## Roadmap

This component is developed as a hobby with no public roadmap or any guarantees of upcoming releases. That said, the following features are planned for upcoming releases:
- ...

## Issue tracking

The issues for this project are tracked on its github.com page. All bug reports and feature requests are appreciated. 

## Building and running tests
```bash
git clone https://github.com/indvd00m/abc-codec/
cd abc-codec
mvn clean install
```

## Contributions

Contributions are welcome, but there are no guarantees that they are accepted as such. Process for contributing is the following:
- Fork this project
- Create an issue to this project about the contribution (bug or feature) if there is no such issue about it already. Try to keep the scope minimal.
- Develop and test the fix or functionality carefully. Only include minimum amount of code needed to fix the issue.
- Refer to the fixed issue in commit
- Send a pull request for the original project
- Comment on the original issue that you have implemented a fix for it

## License & Author

ABC Codec is distributed under Apache License 2.0. For license terms, see LICENSE.

ABC Codec is written by David E. Veliev.
