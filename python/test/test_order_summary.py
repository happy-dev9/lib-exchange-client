# coding: utf-8

"""
    Blockchain.com Exchange REST API

    ## Introduction Welcome to Blockchain.com's Exchange API and developer documentation. These documents detail and give examples of various functionality offered by the API such as receiving real time market data, requesting balance information and performing trades. ## To Get Started Create or log into your existing Blockchain.com Exchange account Select API from the drop down menu Fill out form and click “Create New API Key Now” Once generated you can view your keys under API Settings   # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

import unittest
import datetime

import openapi_client
from openapi_client.com.blockchain.exchange.rest.model.order_summary import OrderSummary  # noqa: E501
from openapi_client.rest import ApiException

class TestOrderSummary(unittest.TestCase):
    """OrderSummary unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test OrderSummary
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = openapi_client.models.order_summary.OrderSummary()  # noqa: E501
        if include_optional :
            return OrderSummary(
                ex_ord_id = 11111111, 
                cl_ord_id = 'ABC', 
                ord_type = 'MARKET', 
                ord_status = 'FILLED', 
                side = 'BUY', 
                price = 0.12345, 
                text = '0', 
                symbol = 'BTC-USD', 
                last_shares = 0.5678, 
                last_px = 3500.12, 
                leaves_qty = 10.0, 
                cum_qty = 0.123345, 
                avg_px = 345.33, 
                timestamp = 1592830770594
            )
        else :
            return OrderSummary(
                cl_ord_id = 'ABC',
                ord_type = 'MARKET',
                ord_status = 'FILLED',
                side = 'BUY',
                symbol = 'BTC-USD',
        )

    def testOrderSummary(self):
        """Test OrderSummary"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)


if __name__ == '__main__':
    unittest.main()
