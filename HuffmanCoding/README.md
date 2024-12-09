# Huffman Coding Project

## Overview
This project implements the Huffman coding algorithm for compressing and decompressing text files. 

## Components
- **HuffmanTree**: Constructs a tree used for encoding and decoding text based on character frequencies.
- **HuffmanNode**: Represents a node in the Huffman tree.
- **HuffmanEncoder**: Encodes text into a binary string using the Huffman tree.
- **HuffmanDecoder**: Decodes a binary string back into text using the Huffman tree.
- **HuffmanFileIO**: Handles reading from and writing to files.
- **Main**: The entry point of the program, managing command-line arguments and orchestrating encoding or decoding processes.

## Usage

### To encode a file, use the following command:

java -jar Huffman.jar encode path/to/input.txt path/to/encoded_output.txt

### To decode a file, use:

java -jar Huffman.jar decode path/to/encoded_output.txt path/to/decoded_output.txt
