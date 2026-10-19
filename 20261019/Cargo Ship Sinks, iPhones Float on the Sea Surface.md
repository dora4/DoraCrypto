# Cargo Ship Sinks, iPhones Float on the Sea Surface

## — On the Truth That “What’s Inside Your Phone Is Worth More Than the Device Itself”, We May Not Be Ready

The other day I read a rather surreal news story.

Singapore-flagged cargo vessel *GFS Pride* caught fire and sank in the Strait of Hormuz, leaving scattered iPhones bobbing on the seawater. Local fishermen retrieved some of them, and videos circulated: over a dozen iPhones floating face-up on the grey-blue water, like soulless glowing fish.

Apple customer service responded that “defective goods will not re-enter the market.”

What I care about is not whether these phones can still work. What I wonder is: **If these were your phones, what would worry you the most?**

Is it the monetary value of the hardware? Or the data stored inside?

## What Is Actually on Your Phone

I did an informal survey. I asked twelve friends one question: “If your phone fell into water and stopped working for good right now, what would upset you most?”

Out of eleven responses, only one person said “the phone itself.”

The rest answered:

- “Photos from last year’s trip that I never backed up.”
- “Voice messages my mom sent me.”
- “All kinds of passwords saved in my notes app.”
- “Scans of my ID and driver’s license that I took for paperwork and never deleted.”
- “Chat history from work groups containing records of key decisions that exist nowhere else.”

As you can see, the physical value of a phone — even a top-spec iPhone — can be covered by insurance or replaced with a new purchase. But once personal data is lost or leaked, much of the damage is irreversible.

Yet most people protect data on their phones in almost exactly the same way they protect the phone hardware.

## What Does a Lock Screen Password Protect?

Back to the sunken ship story.

Suppose those floating iPhones belonged to you. You set a lock screen password, or even Face ID. Is your data safe?

Not necessarily.

A lock screen password only protects against someone physically picking up your phone and trying to unlock it. It keeps ordinary people out, but not specialized forensic tools. In 2026, data extraction tools have a far higher success rate at bypassing locks on mainstream mobile devices than most people realize.

More importantly, the lock screen only guards the phone itself. If you store photos of your ID card, screenshots of bank cards, and password notes on the device, most of these files sit in plaintext storage. Once the lock is bypassed, they can be accessed as easily as opening an unlocked drawer.

There is another, far more common scenario: **Your phone is not stolen, but it is connected to the internet.** You download an app, it requests storage permission, and you grant it without a second thought. Technically speaking, this app can read all files on your phone. Whether it *will* do so depends on the company’s business ethics — something you have no way to verify.

## The Design Logic of DoraBox

DoraBox starts from a simple premise: **Some content on your phone deserves stronger protection than merely a lock screen password.**

It is an application built for encrypted storage of sensitive private data. Its core function is straightforward: securely store your most sensitive files after encryption, accessible only by you.

Behind the word “encryption”, DoraBox implements several critical features:

**Zero-knowledge architecture.** Encryption keys are generated and stored locally on your device and never uploaded to servers. This means even the DoraBox team cannot open your secure vault. This is not a promise; it is baked into the technical design — they physically lack the ability to decrypt your data.

**AES-256 encryption.** This is the encryption standard widely adopted by global financial institutions and military bodies. Brute-force decryption is infeasible under current computing power.

**Local-first design.** Data is stored primarily on your local device. If cross-device sync is needed, files are encrypted locally before transmission. Data transfers are protected via TLS 1.3 and remain as ciphertext on the receiving device. End-to-end encryption across the entire pipeline, with no plaintext exposure window.

**Decoy vault.** This is a distinctive feature. You can set a decoy password that opens a fake vault holding trivial, harmless files. In the unlikely but possible scenario where someone coerces you to unlock your phone after theft or robbery, you can open the decoy vault to satisfy demands.

## What Should Go into the Vault

Not all files need encrypted storage. Takeout order screenshots, meme images from chats, casual landscape photos — these can stay in ordinary storage.

Several categories of files, however, belong inside DoraBox:

**Identity documents.** Scanned copies of ID cards, passports, driver’s licenses and property deeds. Replacing these documents after loss is cumbersome, and leakage carries even greater risks. Someone could register a company using your ID photo, and you might not find out for years.

**Financial records.** Bank account numbers, insurance policies, investment records. Leaks can lead to financial losses and lengthy evidence-gathering and appeal procedures.

**Secret keys.** Crypto wallet seed phrases, API keys, passwords for critical accounts. These are the master keys to your digital assets.

**Medical records.** Health check reports, medical histories and prescriptions. You may not want insurers or employers to view this information. In many jurisdictions, such data can legally affect insurance premiums or hiring decisions.

**Personal records.** Journals, letters, private writings you wish to keep unseen. This is not “hiding things”; it is respecting your own private inner world.

## Reflections Spurred by a Sunken Ship

Those iPhones floating on the sea will eventually be recovered, inspected and destroyed. Their data — if never backed up or encrypted — will vanish with them.

This story of a sunken ship is every person’s story: **What is the current state of the most important information on your phone?**

If your answer is “stored alongside takeout screenshots”, “protected only by a lock screen”, or “saved on some cloud drive with unknown security” —

then it may be time to give these files a genuine safe.

**DoraBox: Not just a locked drawer, but a portable vault you carry with you.**