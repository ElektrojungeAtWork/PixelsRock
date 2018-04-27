//
//  PixelsRockUITests.swift
//  PixelsRockUITests
//
//  Created by Benjamin on 25.04.18.
//  Copyright © 2018 Benjamin Scholtysik. All rights reserved.
//

import XCTest

class PixelsRockUITests: XCTestCase {
        
    override func setUp() {
        super.setUp()
        
        // Put setup code here. This method is called before the invocation of each test method in the class.
        
        // In UI tests it is usually best to stop immediately when a failure occurs.
        continueAfterFailure = false
        // UI tests must launch the application that they test. Doing this in setup will make sure it happens for each test method.
        XCUIApplication().launch()

        // In UI tests it’s important to set the initial state - such as interface orientation - required for your tests before they run. The setUp method is a good place to do this.
    }
    
    override func tearDown() {
        // Put teardown code here. This method is called after the invocation of each test method in the class.
        super.tearDown()
    }
  
  func testButtonsVisible() {
    let app = XCUIApplication()
    XCTAssertEqual(app.buttons["pickerButton"].exists, true)
    XCTAssertEqual(app.buttons["resetButton"].exists, true)
  }
    
}
